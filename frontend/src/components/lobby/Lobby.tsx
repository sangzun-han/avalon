import styles from "./Lobby.module.css";
import OnlineUserList from "./OnLineUserList";

const Lobby = () => {
  const onlineUsers = ["User1", "User2", "User3", "User4"];
  return (
    <main className={styles.layout}>
      <OnlineUserList onlineUsers={onlineUsers} />
      {/* <section className="game-list">
        <h2>게임 목록</h2>
        <ul>
          <li>
            <img src="game1.png" alt="게임 1" />
            <h3>게임 1</h3>
            <p>게임 1의 설명</p>
            <button>플레이</button>
          </li>
          <li>
            <img src="game2.png" alt="게임 2" />
            <h3>게임 2</h3>
            <p>게임 2의 설명</p>
            <button>플레이</button>
          </li>
        </ul>
      </section>

      <section className="chat">
        <h2>채팅</h2>
        <div id="chat-messages"></div>
        <form id="chat-form">
          <input
            type="text"
            id="message-input"
            placeholder="메시지를 입력하세요"
          />
          <button type="submit">전송</button>
        </form>
      </section> */}
    </main>
  );
};

export default Lobby;
