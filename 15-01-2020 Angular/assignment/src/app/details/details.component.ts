import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service/service.service';
@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  constructor( private detser:ServiceService) {}  
      map = this.detser.map
  
  delete(Id){
    this.map.delete(Id);
  }
  ngOnInit() {
    this.map = this.detser.getdata()
  }

}
