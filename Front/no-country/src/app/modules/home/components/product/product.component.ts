import { Component, Input, OnInit } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { RouterLink } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  standalone: true,
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css'],
  imports: [MatButtonModule, RouterLink],
})
export class ProductComponent {
  @Input() product: any;

  constructor() {}

  openAlert(name: string) {
    Swal.fire({
      title: '¡Compraste este producto!',
      text: name,
      icon: 'success',
    });
  }
}
