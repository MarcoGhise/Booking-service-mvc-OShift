package it.blog.openshift.booking;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="booking-service-dao",url="${booking-service-dao.url}")
public interface DaoClient {
	
	  @RequestMapping(method = RequestMethod.GET, value = "/list")
	  List<Booking> getBooking();
	  
	  @RequestMapping(method = RequestMethod.POST, value = "/add")
	  ResponseEntity<String> addBooking(Booking booking);
}