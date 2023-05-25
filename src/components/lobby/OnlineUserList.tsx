import styles from "./OnlineUserList.module.css";
import ProfileImage from "../../assets/images/profile-picture.webp";
import { FaArrowLeft, FaArrowRight } from "react-icons/fa";

interface OnlineUserListProps {
  onlineUsers: string[];
}

const OnlineUserList = ({ onlineUsers }: OnlineUserListProps) => {
  return (
    <section className={styles.online_user_list}>
      <ul>
        {onlineUsers.map((user, index) => (
          <li key={index} className={styles.user_info}>
            <img
              className={styles.user_profile}
              src={ProfileImage}
              alt={`Profile of ${user}`}
            />
            <span>{user}</span>
          </li>
        ))}
      </ul>
      <div className={styles.pagination}>
        <button className={styles.arrowButton}>
          <FaArrowLeft />
        </button>
        <button className={styles.arrowButton}>
          <FaArrowRight />
        </button>
      </div>
    </section>
  );
};

export default OnlineUserList;
