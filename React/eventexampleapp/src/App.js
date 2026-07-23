import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";
import "./App.css";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      count: 0
    };
  }

  incrementCounter = () => {
      this.setState(
          (prevState) => ({
              count: prevState.count + 1
          }),
          () => {
              this.sayHello(this.state.count);
          }
      );
  };

  sayHello = (count) => {
      alert(`Hello! Member #${count}`);
  };

  handleIncrement = () => {
      this.incrementCounter();
  };

  decrementCounter = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  syntheticEvent = () => {
    alert("I was clicked");
  };

  render() {

    return (
      <div className="container">

        <h1>React Event Examples</h1>

        <h2>Counter : {this.state.count}</h2>

        <button onClick={this.handleIncrement}>
          Increment
        </button>

        <button onClick={this.decrementCounter}>
          Decrement
        </button>

        <br /><br />

        <button
          onClick={() => this.sayWelcome("Welcome")}
        >
          Say Welcome
        </button>

        <br /><br />

        <button onClick={this.syntheticEvent}>
          OnPress
        </button>

        <hr />

        <CurrencyConvertor />

      </div>
    );
  }
}

export default App;