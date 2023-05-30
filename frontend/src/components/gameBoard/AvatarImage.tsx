import styles from "./AvatarImage.module.css";

const AvatarImage = () => {
  return (
    <>
      <div
        className={styles.game_setting}
        style={{ transform: `rotate(${360}deg)` }}
      >
        <div
          className={styles.game_setting_inner}
          style={{ transform: `translate(-50%,-50%) rotate(-${360}deg)` }}
        >
          <div className={styles.player}>
            <div className={styles.player_avatar}>
              <div className={styles.player_avatar_background}></div>
              <div className={styles.player_avatar_container}>
                <div className={styles.player_username_wrapper}>
                  <span className={styles.player_username}>닉네임</span>
                </div>
                <div className={styles.player_user_ready_wrapper}>
                  <h1 className={styles.player_user_ready}>READY</h1>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default AvatarImage;
