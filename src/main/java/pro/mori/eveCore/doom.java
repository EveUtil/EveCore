package pro.mori.eveCore;


import pro.mori.moriUtil.Util.ClassUtil;
import pro.mori.moriUtil.Util.FormatUtil;
import pro.mori.moriUtil.Util.HttpClient;
import pro.mori.moriUtil.Util.impl.classImpl;
import pro.mori.moriUtil.Util.impl.formatImpl;
import pro.mori.moriUtil.Util.impl.httpClientImpl;
import pro.mori.moriUtil.common.UrlEnum;

public class doom {

    private ClassUtil classUtil = new classImpl();

    private FormatUtil formatUtil = new formatImpl();

    private HttpClient httpClient = new httpClientImpl();

    private Class<?> cls;

    private String[] args;
//test
    public doom(Class<?> cls,String[] args) {
        this.cls = cls;
        this.args = args;
    }

    public void run() {
        System.out.println("执行成功");

    }
    public doom test(){
        System.out.println(formatUtil.test());
        System.out.println(classUtil.getClassPath(cls));
        System.out.println(UrlEnum.EVE_PRICE_API.getMag());
        String[] s = {"1","2","3"};
        httpClient.getParam(s);
        return this;
    }
}
