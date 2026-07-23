import React from "react";

const IndianTeam = [
    "Sachin",
    "Sehwag",
    "Dhoni",
    "Yuvraj",
    "Raina",
    "Rohit"
];

// Odd Players
export function OddPlayers({ players }) {

    const [first, , third, , fifth] = players;

    return (
        <div>
            <h2>Odd Players</h2>

            <ul>
                <li>First : {first}</li>
                <li>Third : {third}</li>
                <li>Fifth : {fifth}</li>
            </ul>
        </div>
    );
}

// Even Players
export function EvenPlayers({ players }) {

    const [, second, , fourth, , sixth] = players;

    return (
        <div>
            <h2>Even Players</h2>

            <ul>
                <li>Second : {second}</li>
                <li>Fourth : {fourth}</li>
                <li>Sixth : {sixth}</li>
            </ul>
        </div>
    );
}

const T20Players = [
    "Sachin",
    "Dhoni",
    "Rohit"
];

const RanjiPlayers = [
    "Rahane",
    "Pujara",
    "Jadeja"
];

const mergedPlayers = [...T20Players, ...RanjiPlayers];

function IndianPlayers() {

    return (
        <div>

            <OddPlayers players={IndianTeam} />

            <hr />

            <EvenPlayers players={IndianTeam} />

            <hr />

            <h2>Merged Players</h2>

            <ul>
                {mergedPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))}
            </ul>

        </div>
    );
}

export default IndianPlayers;