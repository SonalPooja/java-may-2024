package ClassWork.jun18;

public class ExcelDemo {

    private boolean read = true;
    private boolean write = true;

    public ExcelDemo(boolean read, boolean write) {
        this.read = read;
        this.write = write;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public void show(){
        if(read && !write){
            setRead(true);
            setWrite(false);
            System.out.println("Read permission");
        }
        else if(read && write){
            setRead(true);
            setWrite(true);
            System.out.println("Read and write permission");
        }
        else{
            setRead(false);
            setWrite(true);
            System.out.println("Write only permission");
        }
    }

}
