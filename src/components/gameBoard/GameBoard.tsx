import styles from "./GameBoard.module.css";
import GameBoardImage from "../../assets/images/image-game-board.png";
import AvatarImage from "./AvatarImage";

const GameBoard = () => {
  return (
    <div
      className={styles.game_table}
      style={{ backgroundImage: `url(${GameBoardImage})` }}
    >
      <div className={styles.game_table_settings}></div>
      <div className={styles.game_settings}>
        <AvatarImage />
      </div>
    </div>
  );
};

export default GameBoard;
