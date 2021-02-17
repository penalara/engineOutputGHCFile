# GeneratedJsonTimetable Schema

```txt
engineOutputGHCSchema#/properties/timetable
```

Object with timetable specification resolved.


| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                     |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------------------------ |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [ghcOutput.schema.json\*](../out/ghcOutput.schema.json "open original schema") |

## timetable Type

`object` ([GeneratedJsonTimetable](ghcoutput-properties-generatedjsontimetable.md))

# GeneratedJsonTimetable Properties

| Property                                    | Type    | Required | Nullable       | Defined by                                                                                                                                                                               |
| :------------------------------------------ | ------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [assignedSections](#assignedsections)       | `array` | Required | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections")            |
| [anonymousClassRooms](#anonymousclassrooms) | `array` | Optional | cannot be null | [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms") |

## assignedSections

List of sections assigned in the Timetable.


`assignedSections`

-   is required
-   Type: `object[]` ([AssignedSection](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-assignedsections.md "engineOutputGHCSchema#/properties/timetable/properties/assignedSections")

### assignedSections Type

`object[]` ([AssignedSection](ghcoutput-properties-generatedjsontimetable-properties-assignedsections-assignedsection.md))

## anonymousClassRooms

Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.


`anonymousClassRooms`

-   is optional
-   Type: `object[]` ([AnonymousClassRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))
-   cannot be null
-   defined in: [EngineOutputGHCSchema](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms.md "engineOutputGHCSchema#/properties/timetable/properties/anonymousClassRooms")

### anonymousClassRooms Type

`object[]` ([AnonymousClassRoom](ghcoutput-properties-generatedjsontimetable-properties-setofanonymousclassrooms-anonymousclassroom.md))
