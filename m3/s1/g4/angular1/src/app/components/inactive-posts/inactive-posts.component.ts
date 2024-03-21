import { Component } from '@angular/core';
import { iPosts } from '../../models/posts';
import { PostsService } from '../../posts.service';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrl: './inactive-posts.component.scss'
})
export class InactivePostsComponent {

  postsArray:iPosts[] = [];
  constructor(private postsSvc:PostsService){}

  ngOnInit(){
    this.postsSvc.getInactivePosts().then(post => {
      this.postsArray = post
    })
  }
}
