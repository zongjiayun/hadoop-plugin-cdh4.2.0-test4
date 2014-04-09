package dep;

import java.util.UUID;

public class Dependency {

	private String groupId = "plugin";
	private String artifactId = "plugin";
	private Integer version;

	private String jar = "";

	public Dependency(Integer version, String jar) {
		this.version = version;
		this.jar = jar;
	}

	public String getGroupId() {
//		return groupId;
		return UUID.randomUUID().toString();
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getJar() {
		return jar;
	}

	public void setJar(String jar) {
		this.jar = jar;
	}

	@Override
	public String toString() {

		String dep1 = "<dependency>";
		String groupId = "<groupId>" +this.getGroupId()+"</groupId>";
		String artifactId = "<artifactId>plugin</artifactId>";
		String version = "<version>" + this.getVersion() + "</version>";
		String scope = "<scope>system</scope>";
		String systemPath = "<systemPath>${project.libdir}/" + this.getJar()
				+ "</systemPath>";
		String dep2 = "</dependency>";

		StringBuilder sb = new StringBuilder();

		appendWithEnter(sb, dep1);
		appendWithEnter(sb, groupId);
		appendWithEnter(sb, artifactId);
		appendWithEnter(sb, version);
		appendWithEnter(sb, scope);
		appendWithEnter(sb, systemPath);
		sb.append(dep2);
		return sb.toString();

	}

	private void appendWithEnter(StringBuilder sb, String str) {

		sb.append(str).append("\n");

	}
}
