import './App.css';
import React from 'react';
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Home from './components/Pages/Home';
import FindEvent from './components/Pages/FindEvent';
import ParticipatingEvents from './components/Pages/ParticipatingEvents';
import ViewEvent from './components/Pages/ViewEvent';
import ManagedEvents from './components/Pages/ManagedEvents';

function App() {
  console.log("Hello WorldS");
  return (
    <>
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/find-event" element={<FindEvent />} />
                <Route path="/view-event/:id" element={<ViewEvent />} />
                <Route path="/participating-events" element={<ParticipatingEvents />} />
                <Route path="/managed-events" element={<ManagedEvents />} />
            </Routes>
        </Router>
    </>
  );
}
export default App;