
public class MysqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("MySql Eklendi");
	}

}
