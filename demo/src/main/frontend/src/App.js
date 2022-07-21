import './App.css';
import React from 'react';
import Navbar from "./components/Navbar/Navbar";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Home from './components/Pages/Home';
import FindEvent from './components/Pages/FindEvent';
import YourEvents from './components/Pages/YourEvents';
import ViewEvent from './components/Pages/ViewEvent';

function App() {
  console.log("Hello WorldS");
  return (
    <>
        <Router>
            <Navbar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/find-event" element={<FindEvent />} />
                <Route path="/your-events" element={<YourEvents />} />
                <Route path="/view-event/:id" element={<ViewEvent />} />
            </Routes>
        </Router>
    </>
  );
}
export default App;