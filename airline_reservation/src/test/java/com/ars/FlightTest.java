package com.ars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ars.config.HibernateUtil;
import com.ars.entity.Flight;
import com.ars.model.FlightDTO;
import com.ars.service.FlightService;
import com.ars.serviceImpl.FlightServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FlightTest {

		FlightService fservice=new FlightServiceImpl();
		private static SessionFactory sessionFactory;
		private Session session;
		
		@BeforeAll
		static void setUp() {
			sessionFactory=HibernateUtil.getSessionFactory();
		}
		
		@BeforeEach
		void openSession() {
			session=sessionFactory.openSession();
		}
		
		@AfterEach
		void closeSession() {
			if(session!=null)
				sessionFactory.close();
			System.out.println("Session factory closed");
		}
		
		@Test
		@Order(1)
		void testFlightregister() {
			Transaction tx=session.beginTransaction();
			Flight flight=Flight.builder().flight_id(1234).avilableSeats(36).totalSeats(100).travellerClass("First class").date(null).source("flight").destination("Kolkata").airline(null).build();
			Integer i=(Integer)session.save(flight);
			tx.commit();
			assertThat(i>0).isTrue();
			System.out.println("Flight add successfully");
		}
//		@Test
//		@Order(2)
//		void testUpdateFlight()
//		{
//			Transaction tx=session.beginTransaction();
//			Flight fl=new Flight();
//			fl.setAvilableSeats(69);
//			fl.setDestination("Delhi");
//			fl.setSource("AIRINDIA");
//			fl.setTotalSeats(100);
//			fl.setTravellerClass("ECONIMC");
//			FlightDTO fdto=fservice.updateFlight(2, fl);
//			tx.commit();
//			assertThat(fdto.getDestination()).isEqualTo("Delhi");
//			System.out.println("data update successfully");
//			}
		
//		@Test
//		@Order(3)
//		void testGetFlightById(){
//			
//			FlightDTO fdto=fservice.getFlight(2);
//			assertThat(fdto.getFlight_id()).isEqualTo(2);
//			System.out.println("data get successfully");
//		}
		
//		@Test
//		@Order(4)
//		@DisplayName(value="Negetive Test case")
//		void testDeleteFlight()
//		{
//			fservice.deleteFlight(2);
//			assertThrows(HibernateException.class,()->fservice.getFlight(2));
//			System.out.println("Delete flight successsfully");
//			}
	
}
