import { Component, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  standalone: true,
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css'],
  imports:[RouterLink]
})
export class NavBarComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
