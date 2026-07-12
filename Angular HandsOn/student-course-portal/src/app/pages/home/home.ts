import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit, OnDestroy {

  // String Interpolation
  portalName = 'Student Course Portal';

  courseCount = 12;
  // Property Binding
  isPortalActive = true;

  // Event Binding
  message = '';

  // Two-way Binding
  searchTerm = '';

  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }
  
  ngOnInit() {

  console.log(
      'HomeComponent initialised — courses loaded'
  );

}

ngOnDestroy() {

  console.log(
      'HomeComponent destroyed'
  );

}

}
/*
[property]
One-way binding from Component → HTML

[(ngModel)]
Two-way binding between Component ↔ HTML
*/
