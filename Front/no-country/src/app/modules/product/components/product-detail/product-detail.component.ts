import { Component, OnInit, inject } from '@angular/core';
import { CommentsComponent } from '../comments/comments.component';
import { getProducts } from '../../../../../data/data';
import { ActivatedRoute } from '@angular/router';
import { Product } from '../../types/interfaces';

@Component({
  selector: 'app-product-detail',
  standalone: true,
  imports: [CommentsComponent],
  templateUrl: './product-detail.component.html',
  styleUrl: './product-detail.component.css',
})
export class ProductDetailComponent implements OnInit {
  private activatedRoute = inject(ActivatedRoute);
  product: Product | null = null;

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.product = getProducts.find((product) => product.id === Number(id))!;
  }
}
