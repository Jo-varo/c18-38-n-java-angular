import { Component, EventEmitter, OnInit, Output, output } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { provideMomentDateAdapter } from '@angular/material-moment-adapter';
import { MAT_DATE_LOCALE } from '@angular/material/core';
import * as _moment from 'moment';
import { default as _rollupMoment } from 'moment';
import 'moment/locale/es';
import {
  FormControl,
  FormGroup,
  FormsModule,
  ReactiveFormsModule,
} from '@angular/forms';

const moment = _rollupMoment || _moment;

export const MY_FORMATS = {
  parse: {
    dateInput: 'LL',
  },
  display: {
    dateInput: 'LL',
    monthYearLabel: 'MMM YYYY',
    dateA11yLabel: 'LL',
    monthYearA11yLabel: 'MMMM YYYY',
  },
};

@Component({
  standalone: true,
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css'],
  providers: [
    provideMomentDateAdapter(MY_FORMATS),
    { provide: MAT_DATE_LOCALE, useValue: 'es' },
  ],
  imports: [
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatIconModule,
    MatButtonModule,
    ReactiveFormsModule,
  ],
})
export class SearchBarComponent implements OnInit {
  @Output() searchButtonEvent = new EventEmitter<string>();

  searchForm = new FormGroup({
    city: new FormControl(''),
  });

  constructor() {}

  ngOnInit() {}

  search() {
    let city = this.searchForm.get('city')?.value ?? '';
    city = city.toLocaleLowerCase();
    this.searchButtonEvent.emit(city);
  }
}
