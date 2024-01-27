package day33iterators_enums;

public enum Enums01 {

    /*
	 1)Enum nedir?
	   Bir "enum", bir grup sabiti temsil eden özel bir "sınıftır"
	   (değiştirilemez değişkenler, statik + final değişkenler).
	 2)Enum ve sınıf arasındaki fark nedir?
	   a)Bir enum, tıpkı bir sınıf gibi, niteliklere ve yöntemlere sahip olabilir.
	   Tek fark, enum sabitlerinin genel, statik ve final (değiştirilemez - geçersiz kılınamaz) olmasıdır.
	   b)Bir enum nesne yaratmak için kullanılamaz ve diğer sınıfları genişletemez
	   (ancak arayüzleri uygulayabilir).
	 3) Enumlar Neden ve Ne Zaman Kullanılır?
	   Değişmeyeceğini bildiğiniz değerlere sahip olduğunuzda enum'ları kullanın,
	   ay günleri, günler, renkler, kart destesi vb. gibi.
	 4) Sabitler büyük harflerle yazılmalı, virgül ile ayrılmalı, sonunda noktalı virgül kullanılmamalıdır.
	 */

    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

}
