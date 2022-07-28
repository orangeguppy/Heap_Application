import './App.css';
import React from 'react';
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Home from './components/Pages/Home';
import FindEvent from './components/Pages/FindEvent';
import YourParticipatingEvents from './components/Pages/YourParticipatingEvents';
import ViewEvent from './components/Pages/ViewEvent';
import ManagedEvents from './components/Pages/ManagedEvents';
import CreateEvent from './components/Pages/CreateEvent';

function App() {
  console.log("Hello WorldS");
  return (
    <>
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/find-event" element={<FindEvent />} />
                <Route path="/your-participating-events" element={<YourParticipatingEvents />} />
                <Route path="/view-event/:id" element={<ViewEvent />} />
                <Route path="/managed-events" element={<ManagedEvents />} />
                <Route path="/create-event" element={<CreateEvent />} />
            </Routes>
        </Router>
    </>
  );
}
export default App;