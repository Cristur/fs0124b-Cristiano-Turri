import { Injectable } from '@angular/core';
import { iPosts } from './models/posts';

@Injectable({
  providedIn: 'root',
})
export class PostsService {

  getAllPosts(): Promise<iPosts[]> {

    return fetch('../assets/db.json')
      .then((post) => post.json())
      .then((post) => post.posts)

  }

  getActivePosts():Promise<iPosts[]>{
    return this.getAllPosts()
    .then(post => post.filter(p => p.active))
  }
  getInactivePosts():Promise<iPosts[]>{
    return this.getAllPosts()
    .then(post => post.filter(p => !p.active))
  }




  getRandomposts(n: number, array:iPosts[]):Promise<iPosts[]> {
    array = [];
    return this.getAllPosts()
    .then(res => {
      for (let i = 0; i < n; i++) {
      let rand = Math.floor(Math.random() * res.length);
      array.push(res[rand]);
    }
    return array;
  })

    }
}
