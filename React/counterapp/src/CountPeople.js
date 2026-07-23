import React, { Component } from "react";
import "./CountPeople.css";

class CountPeople extends Component {
  constructor(props) {
    super(props);

    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  UpdateEntry = () => {
    this.setState({
      entrycount: this.state.entrycount + 1
    });
  };

  UpdateExit = () => {
    this.setState({
      exitcount: this.state.exitcount + 1
    });
  };

  render() {
    return (
      <div className="container">

        <div className="counter">

          <div>
            <button onClick={this.UpdateEntry}>Login</button>
            <span> {this.state.entrycount} People Entered!!!</span>
          </div>

          <div>
            <button onClick={this.UpdateExit}>Exit</button>
            <span> {this.state.exitcount} People Left!!!</span>
          </div>

        </div>

      </div>
    );
  }
}

export default CountPeople;