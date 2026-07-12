import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';
//import { OnInit } from '@angular/core';
//import { ChangeDetectorRef } from '@angular/core';    
@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {
 isLoading = false;
  selectedCourseId = 0;

  
  courses = [
  {
    id: 1,
    name: 'Angular',
    code: 'ANG101',
    credits: 4,
    gradeStatus: 'passed'
  },
  {
    id: 2,
    name: 'Java',
    code: 'JAVA101',
    credits: 4,
    gradeStatus: 'failed'
  },
  {
    id: 3,
    name: 'Spring Boot',
    code: 'SPR201',
    credits: 3,
    gradeStatus: 'pending'
  },
  {
    id: 4,
    name: 'SQL',
    code: 'SQL101',
    credits: 3,
    gradeStatus: 'passed'
  },
  {
    id: 5,
    name: 'Git',
    code: 'GIT101',
    credits: 2,
    gradeStatus: 'pending'
  }
];
  /*
trackBy improves performance by allowing Angular
to reuse existing DOM elements instead of recreating
them whenever the array changes.
*/
trackByCourseId(index: number, course: any): number {

  return course.id;

}
  onEnroll(courseId:number){

    console.log("Enrolling in course :",courseId);

    this.selectedCourseId=courseId;

  }

}