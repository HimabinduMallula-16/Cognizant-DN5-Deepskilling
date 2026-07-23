import React, { Component } from "react";

class Posts extends Component {
  constructor(props) {
    super(props);

    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        this.setState({
          posts: data
        });
      })
      .catch((error) => {
        throw error;
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, errorInfo) {
    alert("An error occurred: " + error);
    console.error(error, errorInfo);
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>

        {this.state.posts.map((post) => (
          <div
            key={post.id}
            style={{
              border: "1px solid #ccc",
              padding: "15px",
              margin: "15px",
              borderRadius: "5px"
            }}
          >
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;