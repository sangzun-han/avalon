import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import GamePage from "./pages/GamePage";
import HomePage from "./pages/HomePage";
import Lobby from "./components/lobby/Lobby";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="lobby" element={<Lobby />} />
          <Route path="game" element={<GamePage />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
