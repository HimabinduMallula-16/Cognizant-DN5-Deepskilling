import { CommonModule } from '@angular/common';

import {
  Component,
  Input,
  Output,
  EventEmitter,
  OnChanges,
  SimpleChanges
} from '@angular/core';

import { HighlightDirective } from '../../directives/highlight';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';
@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [CommonModule, HighlightDirective, CreditLabelPipe],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard implements OnChanges {

  @Input()
  course: any;

  @Output()
  enrollRequested = new EventEmitter<number>();

  isExpanded = false;

  enrolled = false;

  ngOnChanges(changes: SimpleChanges): void {

    console.log(changes);

  }

  enroll() {

    this.enrolled = true;

    this.enrollRequested.emit(this.course.id);

  }

  toggleDetails() {

    this.isExpanded = !this.isExpanded;

  }

  get cardClasses() {

    return {

      'card--enrolled': this.enrolled,

      'card--full': this.course.credits >= 4,

      'expanded': this.isExpanded

    };

  }

}