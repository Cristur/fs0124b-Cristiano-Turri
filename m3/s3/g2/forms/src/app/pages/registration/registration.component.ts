import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrl: './registration.component.scss'
})
export class RegistrationComponent {

  form!:FormGroup;
  constructor(private fb: FormBuilder){}

  generi:string[] = [
    "Uomo",
    "Donna",
    "Subumano"
  ]

  ngOnInit(){
    this.form = this.fb.group({
      nome : this.fb.control(null, [Validators.required]),
      cognome : this.fb.control(null, [Validators.required]),
      password : this.fb.control(null, [Validators.required]),
      confermaPassword: this.fb.control(null, [Validators.required]),
      genere: this.fb.control(null, [Validators.required]),
      biografia : this.fb.control(null),
      username : this.fb.control(null, [Validators.required])

    })

  }

  confermaPassword(password:string, confirm:string ):boolean{

    if(this.form.get(password) == this.form.get(confirm))  return true

    return false
    }


  }

