import styles from "./GameBoard.module.css";
import AvatarImage from "./AvatarImage";

const GameBoard = () => {
  return (
    <div className={styles.game_table}>
      <div className={styles.game_table_settings}></div>
      <div className={styles.game_settings}>
        <AvatarImage />
      </div>
    </div>
  );
};

export default GameBoard;
