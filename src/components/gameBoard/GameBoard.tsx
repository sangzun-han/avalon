import styles from "./GameBoard.module.css";
import GameBoardImage from "../../assets/images/image-game-board.png";

const GameBoard = () => {
  return (
    <div
      className={styles.game_table}
      style={{ backgroundImage: `url(${GameBoardImage})` }}
    >
      <div className={styles.game_table_settings}></div>
      <div className={styles.game_settings}></div>
    </div>
  );
};

export default GameBoard;
