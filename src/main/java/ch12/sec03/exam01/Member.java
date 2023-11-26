package ch12.sec03.exam01;

public class Member {
    private String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Member) {
            Member other = (Member) object;

            if(this.id.equals(other.id)) {
                return true;
            }
        }

        return false;
    }
}
