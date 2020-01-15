import { Component, OnInit, NgModule } from '@angular/core';

import { ServiceService } from '../service/service.service';
import { FormGroup } from '@angular/forms';
import { FormControl }from '@angular/forms';
import { Validators }from '@angular/forms';
import { EmailValidator }from '@angular/forms';
import { DetailsComponent } from '../details/details.component';
@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})

export class FormComponent implements OnInit {

  constructor(  private serform:ServiceService,
    )  { }
  ngOnInit() {
  }
  Id:number;
  Name:string='';
  Email:string='';
 Form = new FormGroup({
    I_d:new FormControl('',Validators.required),
    N_ame: new FormControl('',Validators.required),
    E_mail:new FormControl('',Validators.required)
  });
  onSubmit() {
    if( this.Email=='' || this.Name==''){
  console.log("empty values");
  alert("Please Provide All The Values")
  return;
    }
    else{
    this.serform.putdata(this.Form.get('I_d').value,this.Form.get('N_ame').value,this.Form.get('E_mail').value);
    this.Id=0;
    this.Email='';
    this.Name='';
    
    }

  }
}
