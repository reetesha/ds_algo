package com.coding.atlasian;

import java.util.Date;
import java.util.HashMap;
import java.time.Duration;
import java.time.Instant;

/*Imagine we are building an application that is used by many different customers. We want to avoid one customer being able to 
 * overload the system by sending too many requests, so we enforce a per-customer rate limit. 
 * The rate limit is defined as:

“Each customer can make X requests per Y seconds”

Imagine we are building an application that is used by many different customers.
 We want to avoid one customer being able to overload the system by sending too many requests,
  so we enforce a per-customer rate limit. The rate limit is defined as:

“Each customer can make X requests per Y seconds”
*/

//Hashmap key = userId, Value = counter + timestamp
//logic - 100 to 100..
// 1 machine - 
//


public class RateLimiter {
	HashMap<Integer, Limiter> rateLimiter = new HashMap<Integer, Limiter>();
	
	public static void main (String arg[]) {
		RateLimiter a = new RateLimiter();
		System.out.println(a.isAllowed(1));
		System.out.println(a.isAllowed(1));
		System.out.println(a.isAllowed(1));
		
	}
	
	boolean isAllowed(int customerId) {
		boolean isAllowed=false;
		//insert the customerId as key & value as counter + timestamp.
		//3 request per minute  
		//1. If customerId is there in hashmap,then check currentTime-starttime>=1 min * counter <=3. --> Allow
		//map(customerId, counter+ starttime)
		//2. If customerId is there in hashmap,then check currentTime-starttime<=1 min * counter >3.--> reject
		Limiter limit = rateLimiter.get(Integer.valueOf(customerId));
		if(limit!=null) {
			
			//1.check the counter
			if(limit.getCounter()<3) {
			long diff;
			diff=System.currentTimeMillis() - limit.getTime();
			if(diff<=60000) {
				limit.setCounter(limit.getCounter()+1);
				rateLimiter.put(customerId, limit);
				isAllowed= true;
				}
			else {
				isAllowed= false;
				rateLimiter.remove(customerId);
				}
			}
			else {
				isAllowed= false;
				rateLimiter.remove(customerId);
				}
			
		}
		else {
			limit = new Limiter();
			limit.setCounter(1);
			limit.setTime(System.currentTimeMillis());
			rateLimiter.put(customerId, limit);
			isAllowed= true;
		}
		
		
		return isAllowed;	
	}
	class Limiter{
		int counter;
		public int getCounter() {
			return counter;
		}
		public void setCounter(int counter) {
			this.counter = counter;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		long time;
	}
}
