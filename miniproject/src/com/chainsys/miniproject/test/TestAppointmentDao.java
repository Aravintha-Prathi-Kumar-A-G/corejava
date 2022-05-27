package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointmentDao {
	
		
		public static void testGetAllAppointments(){
			List <Appointment> allapp=AppointmentDao.getAllAppointments();
			Iterator<Appointment> appItr=allapp.iterator();
			while(appItr.hasNext()) {
				Appointment app=appItr.next();
				System.out.print("app_id:"+"\t"+app.getApp_id()+"\t"+"doc_date"+app.getApp_date()+"\t"+"doc_id:"+app.getDoc_id());
				System.out.println("\t"+"Collected fees:"+app.getFees_collected());
			}
			
		}
		public static void testgetAppointmentById() {
			Appointment app=AppointmentDao.getAppointmentsById(1002);
			System.out.print("app_id:"+"\t"+app.getApp_id()+"\t"+"doc_date"+app.getApp_date()+"\t"+"doc_id:"+app.getDoc_id());
			System.out.println("\t"+"Collected fees:"+app.getFees_collected());
		}
		public static void testInsertNewAppointments() {
			Appointment app = new Appointment();
			app.setApp_id(1002);
			SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				app.setApp_date(appFormate.parse("12/12/2012"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			app.setDoc_id(1001);
			app.setPatient_name("Roman Regins");
			app.setFees_collected(550);
			app.setFees_catagery("low");
			int result = AppointmentDao.insertAppointments(app);
			System.out.println(result+"row inserted");
		}
		public static void testUpdateAppointments() {
			Appointment app = new Appointment();
			app.setApp_id(1002);
			SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				app.setApp_date(appFormate.parse("03/03/2003"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			app.setDoc_id(1003);
			app.setPatient_name("THE Rock");
			app.setFees_collected(1000);
			app.setFees_catagery("low");
			int result = AppointmentDao.updateAppointments(app);
			System.out.println(result+" row updated");
			
		}
	}
