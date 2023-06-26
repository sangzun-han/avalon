import styles from "./Lobby.module.css";

const Lobby = () => {
  // const onlineUsers = ["User1", "User2", "User3", "User4"];
  return (
    <main className={styles.layout}>
      <section className={styles.lobby}>
        <header>
          <h1 className={styles.title}>AVALON</h1>
          <button className={styles.danger}>로그아웃</button>
        </header>
        <section className={styles.room_button}>
          <button className={styles.btn}>방만들기</button>
        </section>

        <section className={styles.game_rooms}>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
          <div className={styles.room}>
            <h3>Room 1</h3>
            <p>Some description about Room 1.</p>
          </div>
        </section>
      </section>
    </main>
  );
};

export default Lobby;
