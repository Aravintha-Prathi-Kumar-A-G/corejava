package com.chainsys.miniproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;


public class TestDoctorDao {
	
		public static void testGetAllDoctors(){
			List <Doctor> alldoc=DoctorDao.getAllDoctors();
			Iterator<Doctor> docItr=alldoc.iterator();
			while(docItr.hasNext()) {
				Doctor doc=docItr.next();
				System.out.print("doctor_id:"+"\t"+doc.getDoctor_id()+"\t"+"doctor_name"+doc.getDoctor_name()+"\t"+"Speciality:"+doc.getSpeciality());
				System.out.println("\t"+"Standard fees:"+doc.getStandard_fees());
			}
			
		}
		public static void testGetDoctorById() {
			Doctor doc=DoctorDao.getDoctorById(1001);
			System.out.print("doctor_id:"+"\t"+doc.getDoctor_id()+"\t"+"doctor_name"+doc.getDoctor_name()+"\t"+"Speciality:"+doc.getSpeciality());
			System.out.println("\t"+"Standard fees:"+doc.getStandard_fees());
		}
		public static void testInsertDoctor() {
			Doctor doc=new Doctor();
			doc.setDoctor_id(101);
			doc.setDoctor_name("Bruce Wayne");
			SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				doc.setDob(dobFormate.parse("12/12/2012"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			doc.setSpeciality("ORTHO");
	    	doc.setCity("GOWTHAM city");
	    	doc.setPhone_no(6666667777L);
	    	doc.setStandard_fees((float) 35000.00);
	    	int result=DoctorDao.insertDoctor(doc);
	    	System.out.println(result+"rows inserted");
	    }
		public static void testUpdateDoctor() {
			Doctor doc = new Doctor();
			doc.setDoctor_id(1004);
			doc.setDoctor_name("Superman");
			SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				doc.setDob(dobFormate.parse("11/11/2011"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			doc.setSpeciality("dental");
	    	doc.setCity("USA");
	    	doc.setPhone_no(6363636363L);
	    	doc.setStandard_fees((float) 40000);
	    	int result=DoctorDao.updateDoctor(doc);
	    	System.out.println(result+"rows updated");
		}
		public static void testdeleteDoctor() {
			int result = DoctorDao.deleteDoctor(1005);
			System.out.println(result+"row deleted");
		}
		
	}
	