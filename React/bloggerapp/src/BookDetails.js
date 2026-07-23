import React from "react";

function BookDetails() {
  return (
    <div className="box">
      <h2>Book Details</h2>

      <table>
        <thead>
          <tr>
            <th>Book Name</th>
            <th>Author</th>
            <th>Price</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>React Explained</td>
            <td>Zac Gordon</td>
            <td>650</td>
          </tr>

          <tr>
            <td>Learning React</td>
            <td>Alex Banks</td>
            <td>720</td>
          </tr>

          <tr>
            <td>JavaScript</td>
            <td>Douglas Crockford</td>
            <td>550</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default BookDetails;