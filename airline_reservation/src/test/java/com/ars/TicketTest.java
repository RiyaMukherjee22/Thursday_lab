package com.ars;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ars.config.HibernateUtil;
import com.ars.entity.TicketBooking;
import com.ars.model.TicketBookingDTO;
import com.ars.service.PassengerService;
import com.ars.service.TicketService;
import com.ars.serviceImpl.PassengerServiceImpl;
import com.ars.serviceImpl.TicketServiceImpl;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TicketTest {
	
	TicketService tService=new TicketServiceImpl();
	private static SessionFactory sessionFactory;
	private Session session;
	
	@BeforeAll
	static void setUp()
	{
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	@BeforeEach
	void openSession()
	{
		session=sessionFactory.openSession();
	}
	
@AfterEach
void closeSession()
{
	if(session!=null)
	session.close();
	System.out.println("Session closed");
	}
@AfterAll
static void tearDown()
{
	if(sessionFactory!=null)
		sessionFactory.close();
	System.out.println("Session factory colosed");
	}
//test for ticket booking

//@Test
//@Order(1)
//void testTicketBooking() {
//	Transaction tx=session.beginTransaction();
//	TicketBookingDTO  tdto=tService.bookFlight(4, 56, LocalDate.parse("2022-10-25"), "ibt@gmail.com", "AIR INDIA");
//	Integer i=(Integer)session.save(tdto);
//	tx.commit();
//	assertThat(i>0).isTrue();
//	System.out.println("Ticket Booking Successfully");
//}

//test for get ticket

//@Test
//@Order(2)
//void testGetTicketById(){
//	TicketBookingDTO adto=tService.getTicket(86763);
//	assertThat(adto.getTicketId()).isEqualTo(86763);
//	System.out.println("Ticket show successfully");
//}

//test for cancel ticket

//@Test
//@Order(3)
//@DisplayName(value="Negetive Test case")
//void testCancelBooking()
//{
//	tService.cancelBooking(86763);
//	assertThrows(HibernateException.class,()->tService.getTicket(86763));
//	System.out.println("Ticket cancel successfully");
//	}
//
//@Test
//@Order(2)
//void testCancelBooking()
//{
//	tService.cancelBooking(86763);
//	assertThrows(Exception.class, ()->tService.getTicket(86763));
//}
}
