import React, { Component } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";
import "./App.css";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      showBooks: true,
      showBlogs: true,
      showCourses: true
    };
  }

  render() {

    // Method 1: Element Variable
    let books;

    if (this.state.showBooks) {
      books = <BookDetails />;
    }

    return (

      <div className="container">

        <h1>Blogger Application</h1>

        {/* Method 1 */}
        {books}

        {/* Method 2: Ternary Operator */}
        {this.state.showBlogs
          ? <BlogDetails />
          : <h3>Blogs Hidden</h3>}

        {/* Method 3: Logical && */}
        {this.state.showCourses &&
          <CourseDetails />
        }

      </div>

    );
  }
}

export default App;