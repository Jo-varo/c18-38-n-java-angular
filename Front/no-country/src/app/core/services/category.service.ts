import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  _categoryName = new BehaviorSubject<string>("");

  constructor() { }

  get categoryName$(){
    return this._categoryName.asObservable();
  }

  set categoryName(value: string){
    this._categoryName.next(value);
  }
}
