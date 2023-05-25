import { useNavigate } from "react-router-dom";
import styles from "./Home.module.css";

const Home = () => {
  const navigate = useNavigate();

  return (
    <main className={styles.layout}>
      <section className={styles.content}>
        <div className={styles.main_text}>
          <h3>레지스탕스 아발론</h3>
          <h1>AVALON</h1>
          <button
            className={styles.go_lobby}
            onClick={() => navigate("/lobby")}
          >
            게임하러 가기
          </button>
        </div>
      </section>
    </main>
  );
};

export default Home;
