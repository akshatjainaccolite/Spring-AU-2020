import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private comp:ServiceService) { }

  map = new Map();
  putdata(Id,Name,Email) {
    this.map.set(Id,{Name:Name,Email:Email})
  }
  getdata(){
    return this.map;
  }
}
