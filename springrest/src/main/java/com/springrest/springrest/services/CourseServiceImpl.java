package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
//		
//		list = new ArrayList<>();
//		list.add(new Course((long) 145,"History", "History of India"));
//		list.add(new Course((long) 141,"SpringBoot", "Creating REST API using SpringBoot"));
		
	}

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
//		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		 return courseDao.getById(courseId);
		
//		Course c = null;
//		
//		for(Course course:list) 
//		{
//			if(course.getId()==courseId) 
//			{
//				c = course;
//				break;
//			}
//		}
//		
//		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		return course;
		
//		list.add(course);
	}

	@Override
	public Course updateCourse(Course course) {
		
		
		courseDao.save(course);
		return course;
		
//		long courseId = course.getId();
//		Course c = null;
//		
//		for(Course myCourse:list) {
//			
//			if(myCourse.getId()==courseId) {
//				// we want to update this course
//				c = myCourse;
//				myCourse.setTitle(course.getTitle());
//				myCourse.setDescription(course.getDescription());
//				break;
//			}
//		}
//		
//		return c;
	}

	@Override
	public List<Course> deleteCourse(long courseId) {
		
		courseDao.deleteById(courseId);
		return courseDao.findAll();	
				
//		for(Course courseToDelete:list) {
//			if(courseToDelete.getId() == courseId) {
//				list.remove(courseToDelete);
//			}
//		}
//		
//		// return the remaining courses
//		return getCourses();
	}

}
