import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;

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

  ngOnInit(): void {

    // Simulate loading courses from a server
    setTimeout(() => {
      this.isLoading = false;
      console.log('Courses loaded successfully');
    }, 1500);

  }

  onEnroll(courseId: number): void {

    console.log('Enrolling in course:', courseId);

    this.selectedCourseId = courseId;

  }

  /*
   trackBy improves performance by allowing Angular
   to reuse existing DOM elements instead of recreating
   them whenever the array changes.
  */
  trackByCourseId(index: number, course: any): number {

    return course.id;

  }

}