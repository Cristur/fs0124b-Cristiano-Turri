import { Component } from '@angular/core';
import { iPosts } from '../../models/posts';
import { PostsService } from '../../posts.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  postsArr: iPosts[] = [];
  randomPostsArray: iPosts[] = [];

  constructor(private postsSvc:PostsService){}


  ngOnInit(){
    this.postsSvc.getAllPosts()
    .then(post => {
      this.postsArr = post
    })

    this.postsSvc.getRandomposts(4, this.randomPostsArray)
    .then(post =>{
      this.randomPostsArray = post
    })
  }
}

