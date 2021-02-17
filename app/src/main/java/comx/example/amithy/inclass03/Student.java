package comx.example.amithy.inclass03;

import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    public String fastname;
    public String lastname;
    public String studentid;
    public String image;
    public String radio;

    protected Student(Parcel in) {
        fastname = in.readString();
        lastname = in.readString();
        studentid=in.readString();
        image=in.readString();
        radio=in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Student(String fastname, String lastname, String studentid, String image,String radio) {
        this.fastname = fastname;
        this.lastname = lastname;
        this.studentid = studentid;
        this.image=image;
        this.radio=radio;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(fastname);
        dest.writeString(lastname);
        dest.writeString(studentid);
        dest.writeString(image);
        dest.writeString(radio);

    }
}
