package plise_java;

import java.util.Date;

public class Ex4_1 implements Comparable<Ex4_1>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public int hashCode() {
		int result = 37;
		result = result * 31 + title.hashCode();
		result = result * 31 + publishDate.hashCode();
		result = result * 31 + comment.hashCode();
		return result;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (!(object instanceof Ex4_1)) {
			return false;
		}
		Ex4_1 ex4_1 = (Ex4_1) object;
		if (!title.equals(ex4_1.title)) {
			return false;
		}
		if (!publishDate.equals(ex4_1.publishDate)) {
			return false;
		}
		return true;
	}

	public int compareTo(Ex4_1 ex4_1) {
		return this.publishDate.compareTo(ex4_1.publishDate);
	}

	public Ex4_1 clone() {
		Ex4_1 ex4_1 = new Ex4_1();
		ex4_1.title = this.title;
		ex4_1.publishDate = (Date) this.publishDate.clone();
		ex4_1.comment = this.comment;
		return ex4_1;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title セットする title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate セットする publishDate
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment セットする comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}
