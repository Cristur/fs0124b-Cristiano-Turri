import { Component } from '@angular/core';
import { iPosts } from './models/posts';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {

  postsArr:iPosts[] = []
  randomPostsArray:iPosts[] =[]

  generaNumero() {
let numeroRandom = Math.floor(Math.random()*this.postsArr.length)
return numeroRandom
  }
  generaArray(){
    for(let i=0; i<4; i++){
      this.randomPostsArray.push(this.postsArr[this.generaNumero()])
    }
  }

  ngOnInit(){
    fetch("../assets/db.json")
    .then(post => post.json())
    .then((post) =>{
      this.postsArr = post.posts;
      this.generaArray();
    })
  }
}
