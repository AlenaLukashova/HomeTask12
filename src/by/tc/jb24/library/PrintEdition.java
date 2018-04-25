package by.tc.jb24.library;

public class PrintEdition {
		private String title;
		private String publisher;

		public PrintEdition() {
		}

		public PrintEdition(String title, String publisher) {
			this.title = title;
			this.publisher = publisher;
		}

		public PrintEdition(String title) {
			this.title = title;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PrintEdition unit = (PrintEdition) obj;
			if (publisher == null) {
				if (unit.publisher != null)
					return false;
			} else if (!publisher.equals(unit.publisher))
				return false;
			if (title == null) {
				if (unit.title != null)
					return false;
			} else if (!title.equals(unit.title))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "PrintEdition [title=" + title + ", publisher=" + publisher + "]";
		}
}
