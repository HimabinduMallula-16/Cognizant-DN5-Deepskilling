import React from "react";
import "./App.css";
import officeImg from "./office.jpg";

function App() {

  const officeSpaces = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: officeImg
    },

    {
      Name: "Regus",
      Rent: 65000,
      Address: "Bangalore",
      Image: officeImg
    },

    {
      Name: "SmartWorks",
      Rent: 55000,
      Address: "Hyderabad",
      Image: officeImg
    },

    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Mumbai",
      Image: officeImg
    }

  ];

  return (

    <div className="container">

      <h1>Office Space , at Affordable Range</h1>

      {officeSpaces.map((item, index) => (

        <div key={index} className="officeCard">

          <img
            src={item.Image}
            width="25%"
            height="25%"
            alt="Office Space"
          />

          <h2>Name: {item.Name}</h2>

          <h3
            style={{
              color: item.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

        </div>

      ))}

    </div>

  );
}

export default App;