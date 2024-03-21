import { Component } from '@angular/core';
import { iPosts } from '../../models/posts';
import { PostsService } from '../../posts.service';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrl: './active-posts.component.scss'
})
export class ActivePostsComponent {

  postsArray:iPosts[] = [];

  constructor(private postSvc:PostsService){}

  ngOnInit(){

    this.postSvc.getActivePosts().then(post => {

      this.postsArray = post;
    })
  }
}
