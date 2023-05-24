import "./App.css";
import { BrowserRouter, Route, Routes, Navigate } from "react-router-dom";
import GameBoard from "./components/gameBoard/GameBoard";

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="game" element={<GameBoard />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
